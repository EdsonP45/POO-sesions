package mx.utng.s28.persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Partido;

@SpringBootTest
@ComponentScan (basePackageClasses = "mx.utng.s28")
@ExtendWith (SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@
public class PartidoRepositoryTest {

    
}
