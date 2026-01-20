import { ContextProvider } from "../../lib/context.js";

class ThemeContext extends HTMLElement {
    themeProvider = new ContextProvider(this, "theme", "light");
    toggleProvider = new ContextProvider(this, "theme-toggle", () => {
        this.themeProvider.value = this.themeProvider.value === "light" ? "dark" : "light";
    });

    connectedCallback() {
        this.style.display = "contents";
    }
}

export const registerThemeContext = () => customElements.define("x-theme-context", ThemeContext);