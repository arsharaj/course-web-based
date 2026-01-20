class SantasSummary extends HTMLElement {
    constructor() {
        super();
    }

    update(list) {
        const nice = list.filter((item) => item.nice).length;
        const naughty = list.length - nice;
        this.innerHTML = list.length ? `
                <p>${nice} nice, ${naughty} naughty</p>
            ` : `
                <p>Nobody's on the list yet.</p>
            `;
    }
}

export const registerSantasSummary = () => customElements.define("santas-summary", SantasSummary);