package cats

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Cat {
    @Id
    @GeneratedValue
    private Long id;

    public String message;

    def speak(){
        message
    }

}
