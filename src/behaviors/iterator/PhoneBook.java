package behaviors.iterator;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<String> numbersPhone;

    public PhoneBook(){
        this.numbersPhone = new ArrayList<String>();
    }

    public PhoneBook(ArrayList<String> numbersPhone) {
        this.numbersPhone = numbersPhone;
    }

    public void add(String numberPhone){
        this.numbersPhone.add(numberPhone);
    }

    public ArrayList<String> getNumbersPhone() {
        return numbersPhone;
    }

    public void setNumbersPhone(ArrayList<String> numbersPhone) {
        this.numbersPhone = numbersPhone;
    }
}
