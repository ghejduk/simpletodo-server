package pl.ghejduk.application.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
@SuppressWarnings("unchecked")
public class TaskList {

    private final SessionFactory sessionFactory;

    @Autowired
    public TaskList(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @RequestMapping(value = "/all", method = {RequestMethod.GET})
    public List<Task> hello() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Task.class).list();
    }
}
