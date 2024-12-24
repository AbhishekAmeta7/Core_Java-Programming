class A{
    void show1(){
        System.out.println("show1 in class A");
    }
    interface B{
        void show2();
        class C{
            void show3(){
                System.out.println("show3 in class C");
            }
            interface D{
                void show4();
            }
            class E implements C.D{
                public void show4(){
                    System.out.println("show4 in interface D");
                }
            } 
        }
    }
    class F implements A.B{
        public void show2(){
            System.out.println("show2 in interface B");
        }
    }
}
public class ClassInterfaceClassInterface{
    public static void main(String[] args){
        
    }
}
/*class:method 
	interface :method 

		class:method 

			interface :method 


access*/