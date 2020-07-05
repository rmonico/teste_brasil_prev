module testemonico.application.spring {
    requires testemonico.usecase;
    requires testemonico.controller;
    requires testemonico.config;
    requires spring.web;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires com.fasterxml.jackson.databind;
    requires jackson.annotations;
    requires rt;

    opens testemonico.spring.config to spring.core;
}