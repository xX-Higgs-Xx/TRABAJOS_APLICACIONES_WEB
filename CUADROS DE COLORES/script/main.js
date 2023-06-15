document.addEventListener('DOMContentLoaded', function() {
    const boxes = document.getElementsByClassName('box');
  
    for (let i = 0; i < boxes.length; i++) {
      boxes[i].addEventListener('mouseenter', function() {
        this.classList.toggle('green');
        this.classList.toggle('white');
      });
  
      boxes[i].addEventListener('mouseleave', function() {
        this.classList.toggle('green');
        this.classList.toggle('white');
      });
    }
  });
  