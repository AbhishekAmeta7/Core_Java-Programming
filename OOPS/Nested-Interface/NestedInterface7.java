class A{
	void method1(){
		System.out.println("method1 in class A");
	}
	interface B{
		void method2();
		class C{
			void method3(){
				System.out.println("method3 in class C");
			}
			interface D{
				void method4();
				class E{
					void method5(){
						System.out.println("method5 in class E");
					}
				}
			}	
			class G extends D.E{
				public void method4(){
					System.out.println("method4");
				}
			}
		}
		class W extends B.C{
			public void method2(){
				System.out.println("method 2 in interface B");
			}
		}
	}
}
class P extends A.B.W{

}
class R extends C.D.G{
	
}
public class NestedInterface7 {
    public static void main(String[] args) {
       P p = new P();
	   p.method2();
	   p.method3();
	   

    }
}
/*15): class :method 
	interface :method 
		class:method 
			interface:method :define 
				class:method  

access*/