

public class AAtest {

	public void amethod() {

		Mynum a = new Mynum();
		Addnum add1 = new Addnum(a);
		Addnum add2 = new Addnum(a);
		Addnum add3 = new Addnum(a);

		add1.start();
		add2.start();
		add3.start();

	}

	class Mynum {
		int number = 0; // 定义个计数器

	}

	class Addnum extends Thread {
		 Mynum m = null;

		public Addnum(Mynum m) {
			this.m = m;
		}

		public  synchronized  void addMethod() {
			m.number++;
			System.out.println(m.number);
		}

		public void run() {
			while (true) {
				this.addMethod();

			}

		}
	}

	public static void main(String[] args) {
		AAtest a = new AAtest();
		a.amethod();
	}
}
