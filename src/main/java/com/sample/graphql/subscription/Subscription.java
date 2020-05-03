package com.sample.graphql.subscription;

import com.sample.graphql.model.Employee;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.reactivestreams.Publisher;
import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//@Component
public class Subscription implements GraphQLSubscriptionResolver {
    int employeeIdStarter = 10;

    public Publisher<Employee> newEmployee() {

        Flux<Employee> employeeFlux = Flux.create(emitter -> {
            ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
            scheduledExecutorService.scheduleAtFixedRate(newEmployee(emitter), 0, 2, TimeUnit.SECONDS);
        });
        ConnectableFlux<Employee> connectableFlux = employeeFlux.share().publish();
        connectableFlux.connect();
        return Flux.from(connectableFlux);

    }

    private Runnable newEmployee(FluxSink<Employee> emitter) {
        return () -> {
            emitter.next(new Employee().setEmployeeId(employeeIdStarter++).setFirstName("A").setLastName("B").setDepartment("XYZ"));
        };
    }
}
