package apartment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityEntity {
    public int getId() {
        return id;
    }

    public CityEntity setId(int id) {
        this.id = id;
        return this;
    }

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public CityEntity setName(String name) {
        this.name = name;
        return this;
    }
}
