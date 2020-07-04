module testemonico.controller {
    requires lombok;
    requires testemonico.domain;
    requires testemonico.usecase;

    exports testemonico.controller;
    exports testemonico.controller.model;
}