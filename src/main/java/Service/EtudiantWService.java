package Service;

import DATA.Genre;
import DATA.Student;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "serviceWeb")
public class EtudiantWService {
    @WebMethod(operationName = "listStudents")
    public List<Student> listEtudiants(){
        return List.of(
                new Student(1, "ESSAL", "Prénom1", Genre.Homme),
                new Student(2, "Essal2", "Prénom2", Genre.Femme),
                new Student(3, "Eess3", "Prénom3", Genre.Homme)
        );
    }
}
