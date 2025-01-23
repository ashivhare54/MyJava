import java.util.HashSet;
import java.util.Set;
// find missing no.s
public class MissingNo {
    public static void main(String[]args){

        int[] arr={4,3,2,7,8,2,3,1};

//        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int min=arr[0], max=arr[0];


        for(int num:arr){
            if(num<min)
                min=num;
            if(num>max)
                max=num;
        }
        Set<Integer> fullSet=new HashSet<>();
        for(int i=min;i<=max; i++){
            fullSet.add(i);
        }

        for(int num: arr){
            fullSet.remove(num);
        }

        System.out.println("Missing no.s"+ fullSet);

    }
}


//orders = order no., amount  item
//
//customer = customerId customerName orderNo.
//
//
//        select c.customerId,customerName
//        Count(o.orderNo.) as totalOrders
//        Sum(o.amount) as totalAmount
//            from customer c join orders o ON c.orderNo=o.orderNo
//       groupBy c.customerId, customerName