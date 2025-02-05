package com.example.demo;

import com.example.demo.model.Menu;
import com.example.demo.model.Order;
import com.example.demo.model.Pizza;
import com.example.demo.model.Table;
import com.example.demo.service.OrdersService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class DemoApplicationTests {

	@Autowired private DemoApplication app;
	@Autowired private OrdersService ordersService;
	private List<Pizza> listaPizze = new ArrayList<Pizza>();

	@Test
	public void contextLoads(){
		assert true;
	}

	@Test
	public void verificaApp(){
		assertThat(app).isNotNull();
	}

    @Test
	public void testCopertiTavolo(){
		Table t = ordersService.createTable1();
		assertEquals(4,t.getNumMaxCoperti());
	}

	@Test
	public void testDisponibilitaTavolo(){
		Table t = ordersService.createTable1();
		assertTrue(t.isStato());
	}

	@Test
	public void testPizzaMargherita(){
		Pizza p = ordersService.createPizzaMargherita();
		assertNotNull(p);
	}

	@Test
	public void testPrezzotPizzaMargherita(){
		Pizza p = ordersService.createPizzaMargherita();
		assertEquals(4.99,p.getPrice());
	}

	@Test
	public void testElementiNelMenu(){
		Menu m = ordersService.createMenu();
		assertEquals(7,m.getMenuList().size());
	}

	@Test
	public void testOrder(){
		Table t1 = ordersService.createTable1();
		Order o = ordersService.createOrder(2,t1);
		assertNotNull(o);
	}

	@Test
	public void testTotalOrder(){
		Table t1 = ordersService.createTable1();
		Order o = ordersService.createOrder(2,t1);
		o.aggiungiProdotti(ordersService.createPizzaMargherita());
		o.aggiungiProdotti(ordersService.createPizzaSalami());
		o.aggiungiProdotti(ordersService.createWater());
		o.aggiungiProdotti(ordersService.createLemonade());
		assertEquals(15.56, o.totaleOrdine());
	}


	@BeforeEach
	public void testPopolaPizze(){
		listaPizze.add(ordersService.createPizzaMargherita());
		listaPizze.add(ordersService.createPizzaSalami());

	}

	@ParameterizedTest
	@CsvSource({"Pizza Margherita, 4.99","Salami Pizza, 5.99"})
	public void testParametricoPizze(String nomePizza,double prezzo){
    Pizza p = null;
	for(Pizza pizza : listaPizze){
		if(pizza.getName().equals(nomePizza)){
			p = pizza;
		}
	}
	assertEquals(prezzo, p.getPrice());
	}

}
