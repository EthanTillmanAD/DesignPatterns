package patterns.creational.abstractFactory.creatingOurOwn;

public class VisaValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {

		return false;
	}

}
