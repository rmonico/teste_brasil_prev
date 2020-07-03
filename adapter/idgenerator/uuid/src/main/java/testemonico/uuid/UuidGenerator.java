package testemonico.uuid;

import testemonico.usecase.port.IdGenerator;

import java.util.UUID;

public class UuidGenerator implements IdGenerator {

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
