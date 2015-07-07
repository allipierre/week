

public class Zwiebelfunktion {
	
	/*
	 *
	 * Lademittel =  { kleine Palette, Europalette, sehr kleine Kiste, kleine Kiste, mittlere Kiste, große Kiste,
                       sehr große Kiste }
       Fachgröße ={01, 02, 03, . . . , 20}
       
       Zugriffshäufigkeit={A, B, C}
       
       Lagerzone={feuergefährlich, trocken, feucht, Säuren, unter 10 Grad}
	 */

	public static void main(String[] args) {
		/*
		 * Hier ist ein Lagerplatz.Dieser Lagerplatz gehört zu einer Lagerplatzklassen mit den gleichen 
		 * Merkmaleausprägungen
		 * Diese Lagerklasse ist beispielweise L=[{17,2,5,3},{9,2,5,3},{4,2,5,3},{15,2,5,3}]
		 * Hier ermittlen wir ersmal die eindeutigen Kennzahlen für jede Lagertplatz und das
		 * wird in Datenbank gespeichert,damit wir größe Tabelle vermeiden können.
		 */
		int platzklasse []={20,12,7,3,5,0,0,0,0,0,0,0};
		/*
		 * Size ist der maximale Anzahle der Merkmale.Die Anzahle der Mekrmale spielt hier keine
		 * Rolle.
		 */
		int size=10;
		/*Max ist die größte Merkmalsauspägungen über alle Merkmale
		 * ermittelt die gro ̈ßtmo ̈gliche Ordnungszahl, welche fu ̈r die Go ̈delisierung mittels Zwiebelfunktion
		 * beno ̈tigt wird
		 */
		int max=31;
		z_goedel(platzklasse,size,max);
		
	}
	
	public static void z_goedel(int platzklasse[],int size,int max){
		long z_goedelnummer;
		if(platzklasse[0]<=platzklasse[1]){
			 z_goedelnummer=(long) (Math.pow(platzklasse[1],2)+platzklasse[0]);
			
		}else{
			 z_goedelnummer=(long) (Math.pow(platzklasse[0]+1,2)-platzklasse[1]-1);
		}
		
		if(size>=3){
			for(int i=2;i<size;i++){
				 z_goedelnummer+=platzklasse[i]*Math.pow((max+1),i);
				
			}
		}
		System.out.println( z_goedelnummer);
		
		
	}

}
