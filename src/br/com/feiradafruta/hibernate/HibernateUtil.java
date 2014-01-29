package br.com.feiradafruta.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;

@Component
@RequestScoped
public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static Session session;

	public static void salvarOuAtualizar(Object objeto) {

		iniciarSessionFactory();

		abrirSessao();
		session.beginTransaction();

		session.saveOrUpdate(objeto);
		session.getTransaction().commit();

	}

	public static void deletar(Object objeto) {

		iniciarSessionFactory();

		abrirSessao();
		session.beginTransaction();

		session.delete(objeto);
		session.getTransaction().commit();
	}

	public static List listar(Object objeto) {

		abrirSessao();

		Criteria criteria = session.createCriteria(objeto.getClass());

		return criteria.list();
	}

	private static void iniciarSessionFactory() {

		if (sessionFactory == null) {

			Configuration configuration = new Configuration();

			sessionFactory = configuration.configure().buildSessionFactory();
		}
	}

	private static void abrirSessao() {

		if (session == null || !session.isOpen()) {

			session = sessionFactory.openSession();
		}
	}

}
