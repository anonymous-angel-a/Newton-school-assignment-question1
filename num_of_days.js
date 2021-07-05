<script>
const month = parseInt(prompt('Enter the month '));
const year = parseInt(prompt('Enter the year '));
  daysInMonth = new Date(year, month, 0).getDate();
  document.write(daysInMonth);
</script>
