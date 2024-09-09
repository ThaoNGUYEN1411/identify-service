## MapStruct
UserMapper
````
@Mapper(componentModel = "spring",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
    User toEntity(UserCreationRequest userCreationRequest);
    UserCreationRequest toUserCreateRequest(User user);
}
````

injectionStrategy = InjectionStrategy.CONSTRUCTOR Constructor-based injection means that any dependencies required by the mapper (for instance, other mappers or services that might be injected into ItemMapper) will be passed through the constructor.
This strategy is typically used to ensure that dependencies are immutable and explicitly required when creating the mapper instance.
![image](https://github.com/user-attachments/assets/8af5e08b-6804-48b9-be6d-baadc0ceba38)
