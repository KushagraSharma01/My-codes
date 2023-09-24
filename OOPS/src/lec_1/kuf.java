package lec_1;
class kuf{
	public static void main(String[] args) {
		interface Syrupable{
			void getSugary();
		}
		abstract class Pancake implements Syrupable{}
		class BlueBerryPancake implements Pancake{
			public void getSugar() {;}
			
		}
		class SourdoughBlueBerryPancake extende BlueBerryPancake{
			void getSugary(int s) {;}
		}
	}
}
