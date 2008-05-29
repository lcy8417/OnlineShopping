package org.onlineshopping.PaymentWindow;

abstract class PaymentMode {
abstract public void CreditCard(long CreditCardNumber, int CVV, String ExpiryDate, float Amount);
abstract public void DebitCard(long DebitCardNumber, int Pin, String ExpiryDate, float Amount);
abstract public void Paypal(String UserName, String Password, float Amount);
}
