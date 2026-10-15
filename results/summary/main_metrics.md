| dataset | model | N | any-equiv | oneshot | acc | prec | rec |
| --- | --- | --- | --- | --- | --- | --- | --- |
| c2s | GPT-OSS-120B | 416 | 91.8% (382/416) | 85.3% (355/416) | 91.1% (379/416) | 93.8% (379/404) | 99.2% (379/382) |
| c2s | Qwen2.5-Coder-32B-Instruct | 416 | 81.2% (338/416) | 75.0% (312/416) | 76.4% (318/416) | 91.4% (318/348) | 94.1% (318/338) |
| buggycodes | GPT-OSS-120B | 97 | 89.7% (87/97) | 82.5% (80/97) | 88.7% (86/97) | 89.6% (86/96) | 98.9% (86/87) |
| buggycodes | Qwen2.5-Coder-32B-Instruct | 97 | 77.3% (75/97) | 73.2% (71/97) | 72.2% (70/97) | 77.8% (70/90) | 93.3% (70/75) |
| buggyasrts | GPT-OSS-120B | 100 | 76.0% (76/100) | 66.0% (66/100) | 68.0% (68/100) | 73.1% (68/93) | 89.5% (68/76) |
| buggyasrts | Qwen2.5-Coder-32B-Instruct | 100 | 33.0% (33/100) | 18.0% (18/100) | 14.0% (14/100) | 51.9% (14/27) | 42.4% (14/33) |
| naturalness | GPT-OSS-120B | 78 | 79.5% (62/78) | 57.7% (45/78) | 73.1% (57/78) | 79.2% (57/72) | 91.9% (57/62) |
| naturalness | Qwen2.5-Coder-32B-Instruct | 78 | 60.3% (47/78) | 51.3% (40/78) | 56.4% (44/78) | 67.7% (44/65) | 93.6% (44/47) |

Metrics: any-equiv = tasks with any equivalent candidate / N; oneshot = equivalent first candidates / N; acc = equivalent finals / N; prec = equivalent finals / tasks with a final; rec = equivalent finals / tasks with any equivalent candidate. No conformance or validity filter is applied.

Sources: original checker .txt reports, with corresponding .active.txt result blocks taking precedence where available. Tasks absent from an active rerun retain their original result. N counts complete reported tasks, not missing/unreported tasks.
