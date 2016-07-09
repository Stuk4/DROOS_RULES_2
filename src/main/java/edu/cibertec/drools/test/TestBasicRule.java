package edu.cibertec.drools.test;

import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.bean.Transaction;



public class TestBasicRule {
	private static final Logger LOG = LoggerFactory.getLogger(TestBasicRule.class);
	
	
	public static void main(String[] args) {
		KnowledgeBase knowledgeBase = KnowledgeBaseHelper.createKnowledgeBase("basicRule.drl");
		StatefulKnowledgeSession session = knowledgeBase.newStatefulKnowledgeSession();
		
		try {
			LOG.info("Iniciando...");
			
			Transaction trx1 = new Transaction("1", "200", "123456789", 5000, "VISA", "445566", 31321);			
			Transaction trx2 = new Transaction("2", "100", "147852364", 1000, "VISA", "MC", 123);
			Transaction trx3 = new Transaction("3", "100", "321654987", 7500, "VISA", "445566", 312);			
			Transaction trx4 = new Transaction("4", "400", "321654987", 650, "VISA", "445566", 640);
			
			//Insertamos los hechossession.insert(customer1);
			session.insert(trx1);
			session.insert(trx2);
			session.insert(trx3);
			session.insert(trx4);
			session.fireAllRules();
			
			//Mostramos los resultados
			
		} catch (Exception ex) {
			LOG.error("Error al ejecutar la reglas", ex);
		} finally{
			session.dispose();
		}
	}
}
