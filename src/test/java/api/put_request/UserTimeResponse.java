package api.put_request;

import api.put_request.UserTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserTimeResponse extends UserTime {
    private String updatedAt;
}
