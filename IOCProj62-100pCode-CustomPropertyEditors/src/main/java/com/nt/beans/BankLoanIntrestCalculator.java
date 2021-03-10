package com.nt.beans;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("blic")
@PropertySource(value="com/nt/commons/info.properties")
public class BankLoanIntrestCalculator {
	private IntrestAmountDetails details;

	public void setDetails(IntrestAmountDetails details) {
		this.details = details;
	}

	public float calculateIntrestAmount() {
		return (details.getPamt() * details.getRate() * details.getTime())
				/ 100.0f;
	}

}
