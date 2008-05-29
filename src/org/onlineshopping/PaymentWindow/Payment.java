package org.onlineshopping.PaymentWindow;

public abstract class Payment {
protected PaymentMode _P;
public abstract void Pay(int Method);


protected void CreditCard(long CreditCardNumber, int CVV, String ExpiryDate, float Amount){
	_P.CreditCard(CreditCardNumber, CVV, ExpiryDate, Amount);
}

protected void DebitCard(long DebitCardNumber, int Pin, String ExpiryDate, float Amount){
	_P.DebitCard(DebitCardNumber, Pin, ExpiryDate, Amount);
}

protected void Paypal(String UserName, String Password, float Amount){
	_P.Paypal(UserName, Password, Amount);
}
}
