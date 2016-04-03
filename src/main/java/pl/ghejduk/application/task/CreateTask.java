package pl.ghejduk.application.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateTask {

    private final SessionFactory sessionFactory;

    @Autowired
    public CreateTask(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @RequestMapping(value = "/create", method = {RequestMethod.POST})
    public void create(@RequestBody Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.save(task);
    }
}
