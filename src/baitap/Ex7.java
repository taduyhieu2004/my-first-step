package baitap;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n");
        n = sc.nextInt();

        switch (n) {
            case 0: {
                System.out.println("khong");
            }
            case 1: {
                System.out.println("mot");
                break;
            }
            case 2: {
                System.out.println("hai");
                break;

            }
            case 3: {
                System.out.println("ba");
                break;
            }
            case 4: {
                System.out.println("bon");
                break;
            }
            case 5: {
                System.out.println("nam");
                break;
            }
            case 6: {
                System.out.println("sau");
                break;
            }
            case 7: {
                System.out.println("bay");
                break;
            }
            case 8: {
                System.out.println("tam");
                break;
            }
            case 9: {
                System.out.println("chin");
            }
        }
        if (n>=10){
            switch (n/10){
                case 1:{System.out.println("mười");
                break;
            }
                case 2: {
                    System.out.println("hai muoi");
                    break;

                }
                case 3: {
                    System.out.println("ba muoi");
                    break;
                }
                case 4: {
                    System.out.println("bon muoi");
                    break;
                }
                case 5: {
                    System.out.println("nam muoi");
                    break;
                }
                case 6: {
                    System.out.println("sau muoi");
                    break;
                }
                case 7: {
                    System.out.println("bay muoi");
                    break;
                }
                case 8: {
                    System.out.println("tam muoi");
                    break;
                }
                case 9: {
                    System.out.println("chin muoi");
        }
    }
    switch (n%10){
        case 1: {
            System.out.println("mot");
            break;
        }
        case 2: {
            System.out.println("hai");
            break;

        }
        case 3: {
            System.out.println("ba");
            break;
        }
        case 4: {
            System.out.println("bon");
            break;
        }
        case 5: {
            System.out.println("nam");
            break;
        }
        case 6: {
            System.out.println("sau");
            break;
        }
        case 7: {
            System.out.println("bay");
            break;
        }
        case 8: {
            System.out.println("tam");
            break;
        }
        case 9: {
            System.out.println("chin");
    }

}}}}

