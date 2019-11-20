package com.pluszkie.flywayCredit.flyway;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class FlywayConfiguration {

    @PostConstruct
    public void migrateFlyway() {
    Flyway flyway = Flyway.configure()
            .dataSource("jdbc:oracle:thin:@localhost:1521:xe", "user1", "user1")
            .locations("db/migration/my-migrations")
            .baselineOnMigrate(true)
            .load();
    flyway.migrate();
    }

}
