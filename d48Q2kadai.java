//s23010
//DogとCatを作成し、どちらのSoundもa.bに入れ、makeSoundを入力した際に音を出力

class Animal {
	public void makeSound() {
		System.out.print("動物の音");
	}
	public void test(){
		System.out.println("テスト出力");
	}
}

class Dog extends Animal {
	public void makeSound(){
		System.out.println("ワンワン");
	}
}

class Cat extends Animal {
	public void makeSound(){
		System.out.println("ニャー");
	}
}

public class d48Q2kadai {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		a.makeSound();
		b.makeSound();
	}
}
