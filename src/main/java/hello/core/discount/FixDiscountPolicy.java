package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {

        // Enum Type은 == 으로 비교
        // VIP면 천원할인 , 아니면 할인 X
        if(member.getGrade() == Grade.VIP){
            // return price - discountFixAmount;
            return discountFixAmount;
        } else {
            return 0;
        }

        //return price;
    }
}
