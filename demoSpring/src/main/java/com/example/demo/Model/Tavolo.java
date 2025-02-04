package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Tavolo {
    private int NumeroTavolo;
    private int NumeroCoperti;
    private boolean Stato = false;
}
