module testemonico.controller {
    requires lombok;
    requires testemonico.domain;
    requires testemonico.usecase;

    exports testemonico.controller.product;
    exports testemonico.controller.product.model;
    exports testemonico.controller.customer;
    exports testemonico.controller.order;
}