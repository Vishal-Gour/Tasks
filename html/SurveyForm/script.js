function resetForm() {
    document.getElementById("surveyForm").reset();
}

document.getElementById("surveyForm").addEventListener("submit", function(event) {
    event.preventDefault();

    //validation here
    let firstName = document.getElementById("firstName").value;
    let lastName = document.getElementById("lastName").value;
    let dob = document.getElementById("dob").value;
    let country = document.getElementById("country").value;
    let gender = document.querySelector('input[name="gender"]:checked');
    let profession = document.getElementById("profession").value;
    let email = document.getElementById("email").value;
    let mobile = document.getElementById("mobile").value;

    if (!firstName || !lastName || !dob || !country || !gender || !profession || !email || !mobile) {
        alert("Please fill in all fields.");
        return;
    }

    //  message
    let message = `First Name: ${firstName}\n`;
    message += `Last Name: ${lastName}\n`;
    message += `Date of Birth: ${dob}\n`;
    message += `Country: ${country}\n`;
    message += `Gender: ${gender.value}\n`;
    message += `Profession: ${profession}\n`;
    message += `Email: ${email}\n`;
    message += `Mobile Number: ${mobile}`;

    alert(message);
    resetForm();
});
