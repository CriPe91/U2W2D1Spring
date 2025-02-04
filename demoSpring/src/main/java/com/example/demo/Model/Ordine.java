package com.example.demo.Model;

import com.example.demo.ConfigurationClass.CartaMenù;
import com.example.demo.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ordine {

 private Tavolo numeroTavoloAssociato;
 private CartaMenù elementiMenù;
 private StatoOrdine statoOrdine;
 private int numeroCoperti;
 private LocalTime oraPrenotazione;

}
