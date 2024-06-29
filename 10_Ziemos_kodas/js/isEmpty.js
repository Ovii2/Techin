const isEmpty = (fieldId) => {
  let ivestasTekstas = document.getElementById(fieldId);
  const errMsg = document.getElementById(`errorMsg_${fieldId}`);

  if (ivestasTekstas.hasAttribute("required") && ivestasTekstas.value === "") {
    errMsg.innerHTML = "This field can’t be empty";
    ivestasTekstas.classList.add("isEmpty");
    ivestasTekstas.style.borderBottom = "1px solid red";
    
  } else {
    errMsg.innerHTML = "";
    ivestasTekstas.classList.add("notEmpty");
    }
};
