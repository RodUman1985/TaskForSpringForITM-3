package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Island2 {

    private final   Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
