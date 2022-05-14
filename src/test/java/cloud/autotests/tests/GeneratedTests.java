package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Demo qa")
    void generatedTest() {
        step("@Tag(\"demoqa\")", () -> {
            step("// todo: just add selenium action");
        });

        step("public class RegistrationFormTests extends TestBase {", () -> {
            step("// todo: just add selenium action");
        });

        step("@Test", () -> {
            step("// todo: just add selenium action");
        });

        step("@DisplayName(\"Successful fill registration test\")", () -> {
            step("// todo: just add selenium action");
        });

        step("void fillFormTest() {", () -> {
            step("// todo: just add selenium action");
        });

        step("step(\"Open registration form\", () -> {", () -> {
            step("// todo: just add selenium action");
        });

        step("open(\"/automation-practice-form\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".practice-form-wrapper\").shouldHave(text(\"Student Registration Form\"));", () -> {
            step("// todo: just add selenium action");
        });

        step("executeJavaScript(\"$('footer').remove()\");", () -> {
            step("// todo: just add selenium action");
        });

        step("executeJavaScript(\"$('#fixedban').remove()\");", () -> {
            step("// todo: just add selenium action");
        });

        step("});", () -> {
            step("// todo: just add selenium action");
        });

        step("step(\"Fill registration form\", () -> {", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#firstName\").setValue(\"Alex\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#lastName\").setValue(\"Egorov\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#userEmail\").setValue(\"alex@egorov.com\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#genterWrapper\").$(byText(\"Other\")).click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#userNumber\").setValue(\"1231231230\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#dateOfBirthInput\").click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".react-datepicker__month-select\").selectOption(\"July\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".react-datepicker__year-select\").selectOption(\"2008\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".react-datepicker__day--030:not(.react-datepicker__day--outside-month)\").click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#subjectsInput\").setValue(\"Math\").pressEnter();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#hobbiesWrapper\").$(byText(\"Sports\")).click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#uploadPicture\").uploadFromClasspath(\"img/1.png\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#currentAddress\").setValue(\"Some street 1\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#state\").click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#stateCity-wrapper\").$(byText(\"NCR\")).click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#city\").click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\"#stateCity-wrapper\").$(byText(\"Delhi\")", () -> {
            step("// todo: just add selenium action");
        });
    }
}