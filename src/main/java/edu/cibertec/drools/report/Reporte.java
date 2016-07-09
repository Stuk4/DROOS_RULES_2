package edu.cibertec.drools.report;

import org.drools.runtime.rule.RuleContext;
import org.slf4j.Logger;

import edu.cibertec.drools.bean.Transaction;


public class Reporte {
	private static final Logger LOG = 
			org.slf4j.LoggerFactory.getLogger(Reporte.class);

	public static void ok(RuleContext rc, Transaction trx){
		LOG.info("Rule: " + rc.getRule().getName() +
				" transactionID : " + trx.getTrace() +
				", to -> : "  + trx.getToApp());
	}

}
