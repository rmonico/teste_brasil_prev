module testemonico.controller {
    requires lombok;
    requires testemonico.domain;
    requires testemonico.usecase;
    requires rt;

    exports testemonico.controller;
    exports testemonico.controller.model;
}