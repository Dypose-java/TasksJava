package demo_api.pojo.get;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {
    private Long id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Category {
        private Long id;
        @JsonProperty("name")
        private String categoryName;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Tag {
        private Long id;
        private String name;
    }

    @JsonSetter("status")
    public void setStatus(String status) {
        if (!List.of("available", "pending", "sold").contains(status)) {
            throw new IllegalArgumentException("Invalid pet status");
        }
        this.status = status;
    }
}
