/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //ICena (Importe Cena) NumComensales (Numero Comesales) PPComensal (Pago por Comensal)
        double ICena, NumComensales, PPComensal;

        try {
            System.out.printf("Introduce importe de la cena ..: ");
            ICena = SCN.nextDouble();
            System.out.printf("Introduce numero comensales ...: ");
            NumComensales = SCN.nextDouble();

            //Calcular el pago
            PPComensal = ICena / NumComensales;

            System.out.printf("Importe cena (€) ..............: %.2f€%n", ICena);
            System.out.printf("Número comensales .............: %.0f%n", NumComensales);
            System.out.printf("Pago por comensal .............: %.2f€%n", PPComensal);
        } catch (Exception e) {
            System.out.printf("ERROR: Entrada incorrecta.");
        } finally {
            SCN.nextLine();
        }
    }
}
