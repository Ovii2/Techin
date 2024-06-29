document.addEventListener("DOMContentLoaded", function () {
  const styleElement = document.createElement("style");
  styleElement.textContent = `
      #subscribe:checked + label .checkbox-custom {
        background-color: #ba4270;
        border: 1px solid #ba4270;
        opacity: 0.9;
      }
      #subscribe:checked + label .checkbox-custom::before {
        opacity: 0.9;
      }
    `;
  document.head.appendChild(styleElement);
});
