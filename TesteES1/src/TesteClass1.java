
public class TesteClass1 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.println("Teste " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
