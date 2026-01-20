import { registerAvatarComponent } from "./components/avatar/avatar.js";
import { registerBadgeComponent } from "./components/badge/badge.js";
import { registerSantasForm } from "./components/santa/form.js";
import { registerHeaderComponent } from "./components/header/header.js";
import { registerSantasList } from "./components/santa/list.js";
import { registerSantasSummary } from "./components/santa/summary.js";
import { registerApp } from "./app/app.js";
import { registerRouteComponent } from "./components/route/route.js";
import { registerPanelComponent } from "./components/panel/panel.js";
import { registerAccordionComponent } from "./components/accordion/accordion.js";
import { registerThemeContext } from "./components/theme/theme_context.js";

const app = () => {
    registerAvatarComponent();
    registerBadgeComponent();
    registerHeaderComponent();
    registerSantasForm();
    registerSantasList();
    registerSantasSummary();
    registerRouteComponent();
    registerApp();
    registerAccordionComponent();
    registerPanelComponent();
    registerThemeContext();

    const template = document.querySelector("#root");
    if (template) {
        document.body.appendChild(template.content, true);
    }
}

document.addEventListener("DOMContentLoaded", app);