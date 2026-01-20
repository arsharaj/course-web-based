class Html extends String { }

export const htmlRaw = str => new Html(str);

export const htmlEncode = (value) => {
    if (value instanceof Html) {
        return value;
    } else {
        return htmlRaw(
            String(value).replace(/[&<>'"]/g,
                tag => ({
                    '&': '&amp;',
                    '<': '&lt;',
                    '>': '&gt;',
                    "'": '&#39;',
                    '"': '&quot;'
                }[tag]))
        );
    }
}

export const html = (strings, ...values) =>
    htmlRaw(String.raw({ raw: strings }, ...values.map(htmlEncode)));
