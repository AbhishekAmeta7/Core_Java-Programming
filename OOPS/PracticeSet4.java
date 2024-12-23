import java.util.Scanner;
public class PracticeSet4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sample Input: ");
        int n = sc.nextInt();
        System.out.print("Enter the no of ticket: ");
        int ticket = sc.nextInt();
        char ref,ck,circle; 
        float total = 0,per=0;
        if(ticket>=5 && ticket<=40){
            if(ticket>20){
                System.out.print("Do you want refreshment: ");
                ref = sc.next().charAt(0);
                if(ref == 'y'){
                    System.out.print("Do you have coupon code: ");
                    ck = sc.next().charAt(0);
                    if(ck=='y'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            per = total*10/100;
                            total = total-per;
                            per= total*2/100;
                            total = total-per;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            per = total*10/100;
                            total = total-per;
                            per= total*2/100;
                            total = total-per;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else if(ck=='n'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            per = total*10/100;
                            total = total-per;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            per = total*10/100;
                            total = total-per;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else{
                        System.out.println("Invalid ");
                    }
                }
                else if(ref == 'n'){
                    System.out.print("Do you have coupon code: ");
                    ck = sc.next().charAt(0);
                    if(ck=='y'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            per = total*10/100;
                            total = total-per;
                            per= total*2/100;
                            total = total-per;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            per = total*10/100;
                            total = total-per;
                            per= total*2/100;
                            total = total-per;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else if(ck=='n'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            per = total*10/100;
                            total = total-per;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            per = total*10/100;
                            total = total-per;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else{
                        System.out.println("Invalid ");
                    }
                }
            }
            else if(ticket>=5 && ticket<=20){
                System.out.print("Do you want refreshment: ");
                ref = sc.next().charAt(0);
                if(ref == 'y'){
                    System.out.print("Do you have coupon code: ");
                    ck = sc.next().charAt(0);
                    if(ck=='y'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            per= total*2/100;
                            total = total-per;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            per= total*2/100;
                            total = total-per;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else if(ck=='n'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            total = total+ticket*50;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else{
                        System.out.println("Invalid ");
                    }
                }
                else if(ref == 'n'){
                    System.out.print("Do you have coupon code: ");
                    ck = sc.next().charAt(0);
                    if(ck=='y'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            per= total*2/100;
                            total = total-per;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            per= total*2/100;
                            total = total-per;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else if(ck=='n'){
                        System.out.print("Enter the circle: ");
                        circle = sc.next().charAt(0);
                        if(circle == 'k'){
                            total = ticket*75;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else if(circle == 'q'){
                            total = ticket*150;
                            System.out.println("Sample Output: "+n);
                            System.out.println("Ticket cost: "+total);
                        }
                        else{
                            System.out.println("Invelid Circle");
                        }
                    }
                    else{
                        System.out.println("Invalid ");
                    }
                }
            }
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}