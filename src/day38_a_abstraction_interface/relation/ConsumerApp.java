package day38_a_abstraction_interface.relation;

import day38_a_abstraction_interface.shopping.Shipping;
// Going from interface to interface is INHERITANCE, and we use "extends" keyword
// Since these are interface, they do not follow the same rules as classes. So
public interface ConsumerApp extends AllowUserToSell, Shipping {


}
// class - class ---------> extends'
// class - interface ----- > implements
// interface - interface -- > extends

abstract class TestA implements Shipping, AllowUserToSell {

}