class HelloWorldComponent extends HTMLElement {
    connectedCallback() {
        this.textContent = "Hello World !";
    }
}
customElements.define("x-hello-world", HelloWorldComponent);