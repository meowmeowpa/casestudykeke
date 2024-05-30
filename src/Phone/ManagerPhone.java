package Phone;

import java.util.Arrays;
import java.util.Comparator;

public class ManagerPhone {
    Phone[] ListPhone= new Phone[0];
    public void sortPhoneWithPrice(boolean ascending){
        Comparator<Phone>comparator=Comparator.comparing(Phone::getPrice);
        if (!ascending){
            comparator=comparator.reversed();

        }
        Arrays.sort(ListPhone,comparator);
    }
    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (Phone phone : ListPhone){
            totalPrice += (phone.getPrice()* phone.getNumber());
        }
        return totalPrice;
    }
    public boolean removePhoneWithPhoneName(String deletePhoneName){
        for (int i=0; i< ListPhone.length;i++){
            if (ListPhone[i].getName().equalsIgnoreCase(deletePhoneName)){
                Phone[] newPhone= new Phone[ListPhone.length-1];
               System.arraycopy(ListPhone, 0, newPhone,0,i);
               System.arraycopy(ListPhone,i+1,newPhone,i,ListPhone.length-i-1);
               ListPhone=newPhone;
               return true;
            }
        }
        return false;
    }
    public Double findPricePhoneWithPhoneName(String keyword){
        for (Phone phone : ListPhone){
            if (phone.getName().equalsIgnoreCase(keyword)){
                return phone.getPrice();
            }
        }
        return null;
    }
    public Phone[] addPhone(Phone newPhone){
        Phone[] newListPhone= new Phone[ListPhone.length+1];
        newListPhone[0]=newPhone;
        System.arraycopy(ListPhone,0, newListPhone,1,ListPhone.length);
        ListPhone = newListPhone;
        return ListPhone;
    }
    public void displayListPhone(){
        for (Phone phone : ListPhone){
            System.out.println(phone.toString());
        }

    }
}
