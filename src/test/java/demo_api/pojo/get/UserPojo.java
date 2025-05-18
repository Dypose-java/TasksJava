package demo_api.pojo.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo {
     private long id;
     @JsonProperty("username")
     private String userName;
     private String firstName,lastName,email,password,phone;
     private int userStatus;

}
