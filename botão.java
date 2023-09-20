const toggleButton = document.getElementById('toggleNav');
const nav = document.querySelector('nav');

toggleButton.addEventListener('click', () => {
  if (nav.classList.contains('show-nav')) {
    nav.classList.remove('show-nav');
  } else {
    nav.classList.add('show-nav');
  }
});
